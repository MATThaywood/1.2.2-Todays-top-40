 /**
 * Write a description of class ArrayMediaLib here.
 *
 * @author (matt h)
 * @version (first edition lol)
 */
public class ArrayMediaLib
{
    private String Song;
    public static void main(){
    String[] sharingFriends = null;
    sharingFriends = new String[5];
    sharingFriends[0] = "tyler";
    sharingFriends[1] = "jamir";
    sharingFriends[2] = "alec";
    sharingFriends[3] = "marc";
    sharingFriends[4] = "henry";
    for (int i = 0; i  < 5; i++)
    {
        System.out.println(sharingFriends[i]);
    }
    int [] daysBetweenPurchase = {2, 5, 1, 2, 4, 2, 1, 3};
    int total = 0;
    for(int val : daysBetweenPurchase)
    {
        total = total + val;
    }
    System.out.println(total / daysBetweenPurchase.length);
    Songs song1 = new Songs();
    Songs[] topTenSongs = {new Songs("uptown funk"),new Songs("party rock anthem"),new Songs("hey jude"),new Songs("despacito"),new Songs("Bohemian Rhapsody"),new Songs("macarena"),new Songs("all about that bass"),new Songs("somebody that i used to know"),new Songs("happy"),new Songs("closer")};
    for (Songs s: topTenSongs)
    {
        System.out.println(s.getTitle());
    }
    System.out.println("-BEFORE--");
    for (Songs changeSong : topTenSongs) {
    changeSong = new Songs("test");
    System.out.println(changeSong.getTitle());
    }   
    System.out.println("-AFTER--");
    for (Songs showSong : topTenSongs) {
    System.out.println(showSong.getTitle());
    }
    for (int i = 0; i < 10; i++)
    {
        topTenSongs[i] = new Songs("test");
    }
    for (Songs changeSong: topTenSongs)
    {
        changeSong.setPrice(1.29);
        System.out.println(changeSong.getPrice());
        
    }
         for (int i = 0; i < topTenSongs.length; i++){
             if (i % 3 == 0) {
                 topTenSongs[i].setPrice(.99);
                }
             System.out.println(topTenSongs[i].getPrice());
}
                  
   } 
}

   
    
    
    
    
    
    
    
    




   
    
  
    