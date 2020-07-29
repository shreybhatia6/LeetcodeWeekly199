public class Question2 {
    public int minFlips(String target) {
        int index = -1;
        for (int i = 0; i < target.length(); i++){
            if (target.substring(i,i+1).equals("1")){
                index = i;
                break;
            }
        }
        if (index == -1)
            return 0;
        String mod = target.substring(index);
        int switches = 1;
        String end = "0";
        if (mod.substring(mod.length()-1, mod.length()).equals("1")){
            switches = 1;
            end = "1";
        }

        for (int k = mod.length()-2; k >= 0; k--) {
            if (!mod.substring(k,k+1).equals(end)){
                switches++;
                end = mod.substring(k,k+1);
            }
        }
        return switches;

    }
}

