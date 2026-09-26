class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map = new HashMap<>();
        for(List<String> str : knowledge){
            map.put(str.get(0),str.get(1));
        }
        StringBuilder str = new StringBuilder();
        int i = 0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                int j = i+1;
                while(s.charAt(j)!=')') j++;
                String sub = s.substring(i+1,j);
                if(map.containsKey(sub)){
                    str.append(map.get(sub));
                }else{
                    str.append("?");
                }
                i = j+1;
            }else{
                str.append(s.charAt(i)+"");
                i++;
            }
        }
        return str.toString();
    }
}