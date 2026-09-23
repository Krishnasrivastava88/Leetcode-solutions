class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>ans=new ArrayList();
        if (digits.length()==0){
            return ans;
        }
        sol(digits,"",ans);
        return ans;
    }


	public static void sol(String str,String ans, List<String>list) 
	{
		if(str.length()==0) {
			list.add(ans);
			return;
		}
		char ch =str.charAt(0);
		String s= get(ch);
		for(int i=0;i<s.length(); i++) {
			sol(str.substring(1),ans + s.charAt(i),list);
		}
	}
	public static String get(char ch) 
	{
		if (ch=='2') 
		{
			return "abc";
		}
		if (ch=='3') 
		{
			return "def";
		}
		if (ch=='4') 
		{
			return "ghi";
		}
		if (ch=='5') 
		{
			return "jkl";
		}
		if (ch=='6') 
		{
			return "mno";
		}
		if (ch=='7') 
		{
			return "pqrs";
			
		}
		if (ch=='8') 
		{
			return "tuv";
		}
		if (ch=='9') 
		{
			return "wxyz";
		}
		return ".";
	}
	
}

        
