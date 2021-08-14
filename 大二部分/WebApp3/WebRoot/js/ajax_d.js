function createXMLHttpRequest() {
	try {
		return new XMLHttpRequest();
	} catch (e) {
		try {
			return ActvieXObject("Msxml2.XMLHTTP");
		} catch (e) {
			try {
				return ActvieXObject("Microsoft.XMLHTTP");
			} catch (e) {
				throw e;
			}
		}
	}
}