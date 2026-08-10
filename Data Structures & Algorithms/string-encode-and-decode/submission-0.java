class Solution {

    public String encode(List<String> strs) {
StringBuilder encode=new StringBuilder();

for(String str:strs){
    encode.append(str.length()).append('#').append(str);
}
return encode.toString();
    }

    public List<String> decode(String str) {
        List<String> result=new ArrayList<>();

        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            //find length
            int length=Integer.parseInt(str.substring(i,j));
            j++;
            String s=str.substring(j,j+length);
            result.add(s);

            i=j+length;

        }
        return result;

    }
}
