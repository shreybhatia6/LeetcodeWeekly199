public class Question1 {
    public String restoreString(String s, int[] indices) {
        String result="";
        for (int i = 0; i < indices.length; i++){
            int tempIndex = 0;
            for (int j = 0; j < indices.length; j++){
                if (indices [j] == i){
                    tempIndex = j;
                }
            }
            result+=s.substring(tempIndex, tempIndex+1);
        }
        return result;
    }
}

