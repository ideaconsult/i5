package net.idea.i6.io;

import net.idea.i5.io.IROOT_OBJECTS;

public enum I6_ROOT_OBJECTS  implements IROOT_OBJECTS {
	AttachmentDocument {
		@Override
		public boolean isScientificPart() {
			return false;
		}
	},
	LegalEntity {
		@Override
		public boolean isScientificPart() {
			return false;
		}
	},
	REFERENCESUBSTANCE {
		@Override
		public String getContextPath() {
			return "eu.europa.echa.iuclid6.namespaces.reference_substance._2.REFERENCESUBSTANCE";
		}

		@Override
		public boolean isScientificPart() {
			return false;
		}
	},
	SUBSTANCE {
		@Override
		public String getContextPath() {
			return "eu.europa.echa.iuclid6.namespaces.substance._2.SUBSTANCE";
		}

		@Override
		public boolean isScientificPart() {
			return false;
		}
	},
	ENDPOINT_SUMMARY {
		@Override
		public String getContextPath() {
			return null;
		}

		@Override
		public boolean isScientificPart() {
			return false;
		}
	},
	ENDPOINT_STUDY_RECORD {
		@Override
		public String getContextPath() {
			return null;
		}

		@Override
		public boolean isScientificPart() {
			return false;
		}
	},
	scientificPart {
		@Override
		public String getContextPath() {
			return null;
		}

		@Override
		public boolean isScientificPart() {
			return false;
		}
	};
	public String getContextPath() {return null;}
	public abstract boolean isScientificPart();
}