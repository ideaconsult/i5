package net.idea.i5._5.ambit2.json;

import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;

public class Experiment<PROTOCOLPARAMS extends IParams, CONDITIONS extends IParams>
		extends
		ProtocolApplication<Protocol, PROTOCOLPARAMS, String, CONDITIONS, String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1839336541697930225L;

	public Experiment(Protocol protocol) {
		super(protocol);
	}

	@Override
	public Protocol getProtocol() {
		return super.getProtocol();
	}

	public String generateJSONSchema() throws Exception {
		/*
		 * ObjectMapper mapper = new ObjectMapper(); MySchemaFactoryWrapper
		 * visitor = new MySchemaFactoryWrapper();
		 * mapper.acceptJsonFormatVisitor(mapper.constructType(getClass()),
		 * visitor); JsonSchema schema = visitor.finalSchema(); return
		 * mapper.writerWithDefaultPrettyPrinter().writeValueAsString(schema);
		 */
		return null;
	}

}

/*
 * class MySchemaFactoryWrapper extends SchemaFactoryWrapper {
 * 
 * private static class MySchemaFactoryWrapperFactory extends WrapperFactory {
 * 
 * @Override public SchemaFactoryWrapper getWrapper(SerializerProvider p) {
 * MySchemaFactoryWrapper wrapper = new MySchemaFactoryWrapper();
 * wrapper.setProvider(p); return wrapper; }; };
 * 
 * public MySchemaFactoryWrapper() { super(new MySchemaFactoryWrapperFactory());
 * }
 * 
 * @Override public JsonMapFormatVisitor expectMapFormat(JavaType type) throws
 * JsonMappingException { JsonMapFormatVisitor visitor = (JsonMapFormatVisitor)
 * super.expectMapFormat(type);
 * 
 * return visitor; }
 * 
 * private void addProperty(JsonSchema s, JavaType type) { if
 * (!s.isSimpleTypeSchema()) { throw new
 * RuntimeException("given non simple type schema: "+ s.getType()); }
 * s.asSimpleTypeSchema().setTitle(type.getGenericSignature()); } }
 */