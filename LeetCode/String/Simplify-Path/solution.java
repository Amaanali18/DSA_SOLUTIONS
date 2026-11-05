class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        System.out.println(Arrays.toString(arr));
        Stack<String> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("") || arr[i].equals(".")) continue;
            if(arr[i].equals("..")){
                if(st.size()>0) st.pop();
            }else{
                st.push(arr[i]);
            }
        }
        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()){
            str.insert(0,st.pop());
            if(st.size()>0) str.insert(0,"/");
        }
        str.insert(0,"/");
        return str.toString();
    }
}