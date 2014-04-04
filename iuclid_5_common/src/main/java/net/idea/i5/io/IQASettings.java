package net.idea.i5.io;

public interface IQASettings {
	public enum qa_field {
		purposeflag {
			public void addOption(QASettings qa, String value) {
				qa.addPurposeflagOption(value);
			}
		},
		studyresulttype {
			public void addOption(QASettings qa, String value) {
				qa.addStudyResultOption(value);
			}
		},
		testmaterial {
			public void addOption(QASettings qa, String value) {
				qa.addTestMaterialIdentityOption(value);
			}
		},
		reliability {
			public void addOption(QASettings qa, String value) {
				qa.addReliabilityOption(value);
			}
		},
		referencetype {
		@Override
			public void addOption(QASettings qa, String value) {
				qa.addReferenceTypeOption(value);
			}	
		}
		;
		public abstract void addOption(QASettings qa,String value);
		
	}
	public QASettings getQASettings();
	public void setQASettings(QASettings qa);
}
