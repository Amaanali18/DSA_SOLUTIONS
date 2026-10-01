class Solution {
    public int compareVersion(String version1, String version2) {
        String[] ver1 = version1.split("\\.");
        String[] ver2 = version2.split("\\.");
        for(int i=0;i<Math.max(ver1.length,ver2.length);i++){
            int x = i<ver1.length ? Integer.parseInt(ver1[i]) : 0;
            int y = i<ver2.length ? Integer.parseInt(ver2[i]) : 0;
            if(x < y){
                return -1;
            }else if(x > y){
                return 1;
            }
        }
        return 0;
    }
}