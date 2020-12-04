package org.blueroad.docker;

public class BluePing {
    public static void main(String args[]) throws Exception{
        for(int i = 0 ; i < 10; i++){
            System.out.println("Blue Ping " + i );
            Thread.sleep(1000);
        }
    }
}
