
````
mvn clean jaxb2:xjc  -Dfile.encoding=UTF-8
````



````
			<plugin>
				<groupId>org.codehaus.mojo</groupId>
				<artifactId>jaxb2-maven-plugin</artifactId>
				<version>2.2</version>
				<executions>
					<execution>
						<id>generate Java classes</id>
						<phase>generate-sources</phase>
						<goals>
							<goal>xjc</goal>
						</goals>
					</execution>
				</executions>
				<configuration>
					<packageName>eu.europa.echa.iuclid6</packageName>
					<sources>
						<source>src/main/xsd</source>
					</sources>
					<addGeneratedAnnotation>true</addGeneratedAnnotation>
					<locale>en</locale>
				</configuration>
			</plugin>
			<plugin>
				<artifactId>maven-resources-plugin</artifactId>
				<version>3.0.1</version>
				<executions>
					<execution>
						<id>copy-resources</id>
						<phase>process-classes</phase>
						<goals>
							<goal>copy-resources</goal>
						</goals>
						<configuration>
							<outputDirectory>${basedir}/main/xjb</outputDirectory>
							<resources>
								<resource>
									<directory>${basedir}/target/generated-sources/jaxb</directory>
									<filtering>false</filtering>
								</resource>
							</resources>
						</configuration>
					</execution>
				</executions>
			</plugin>

````			

works in subfolder, but gives error as explained in http://stackoverflow.com/questions/30834601/using-xjb-with-jaxb2-maven-plugin

alternative
````
	<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-antrun-plugin</artifactId>
					<version>1.8</version>
					<executions>
						<execution>
							<id>generate-i6-classes</id>
							<phase>generate-sources</phase>
							<goals>
								<goal>run</goal>
							</goals>
							<configuration>
								<tasks>
									<mkdir dir="${project.build.directory}/generated-sources/jaxb/eu/europa/echa/iuclid6" />
									<exec executable="${env.JAVA_HOME}/bin/xjc.exe" dir="${project.basedir}/src/main/xsd">
										<arg value="-p" />
										<arg value="eu.europa.echa.iuclid6" />
										<arg value="-b" />
										<arg value="${project.basedir}/src/main/xjb" />
										<arg value="-d" />
										<arg value="${project.build.directory}/generated-sources/jaxb" />
										<arg value="." />
									</exec>
								</tasks>
							</configuration>
						</execution>
					</executions>
				</plugin>
````

maven plugin doesn't seem to work with xjb ...
command line

````
xjc -b ..\xjb\bindings.xjb REFERENCE_SUBSTANCE-2.0.xsd -extension
````