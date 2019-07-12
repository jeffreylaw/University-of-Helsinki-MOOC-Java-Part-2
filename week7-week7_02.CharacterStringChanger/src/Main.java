public class Main {
    public static void main(String[] args) {

          Changer scandiesAway = new Changer();
  scandiesAway.addChange(new Change('a', 'b'));
    scandiesAway.addChange(new Change('c', 'f'));

  System.out.println(scandiesAway.change("aaaaaaaccc"));
//  Changer changer = new Changer();
//    changer.addChange( new Change('a', 'b') );
//    changer.addChange( new Change('k', 'x') );
//    changer.addChange( new Change('o', 'å') );
//
//    String word = "carrot";
//changer.change(word);
//
//    System.out.println( word   );  // print pårxxbnb
        
    }
}
