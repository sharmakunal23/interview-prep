package dsa.arrays;

/*
    Not a leetcode problem, this was asked in one of the first coding interview questions I tried solving during a live interview.

    Problem: Given two strings 111.222.33.5 and 2.4.6.2, return the larger ip address.
    Note, a string could be something like 111.222, we should consider it valid and if compared with 110.222.000.1,
    should return 111.222 as the larger ip address
 */
public class CompareIPV4 {
    public String solution(String ip1, String ip2){
        int[] ipBlock1 = splitIp(ip1);
        int[] ipBlock2 = splitIp(ip2);

        return compareBlocks(ipBlock1, ipBlock2) ? ip1 : ip2;
    }

    private int[] splitIp(String ip){
        int[] ipBlock = {-1, -1, -1, -1};
        String[] block = ip.split("\\.");

        int size = block.length;
        if (size > 4 || size < 1){
            throw new IllegalArgumentException("IPv4 is invalid with ip: "+ ip);
        }

        for (int i = 0; i < size; i++){
            try {
                ipBlock[i] = Integer.parseInt(block[i]);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("IPv4 is invalid with ip: "+ ip);
            }
        }

        return ipBlock;
    }

    private boolean compareBlocks(int[] ip1, int[] ip2){
        for (int i = 0; i < 4; i++) {
            if (ip1[i] == ip2[i]) {
                continue;
            }
            return ip1[i] > ip2[i];
        }
        return true;
    }
}
