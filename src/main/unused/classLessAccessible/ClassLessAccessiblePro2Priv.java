package main.unused.classLessAccessible;

public class ClassLessAccessiblePro2Priv {

	protected class ClassLessAccessiblePro2PrivInner {
		
		public int publicField;
		private int privateField;
		
		public int publicMethod() {
			return 0;
		}
		
		public int privateMethod() {
			return 0;
		}
	}
}
