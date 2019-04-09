package keyouxing.string;

public class ReplaceSpaces {
	
	public String replaceSpace(StringBuffer str) {
		
		if(str == null || str.length() == 0)
			return "";
			
		StringBuffer sb = new StringBuffer();
		
		for( int i = 0;i < str.length(); i++ ) {
			
			if(str.charAt(i) == ' ') {
				sb.append("%20");
			}else {
				sb.append(str.charAt(i));
			}
			
		}
		return sb.toString();
		
	}
}