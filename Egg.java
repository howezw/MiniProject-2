import java.util.Random;


class Egg {
  //Create the two instance variables 
  private String eggColor;
  private String eggContent;
// Create The Contructor for Egg
  Egg() {
    eggColor = "";
    eggContent = "";
  }
//Making a array to produce random colors
  String randomColor() {
    final String[] color = new ArrayList(color);
    
    return color;
    Random random = new Random();
    int index = random.nextInt(color.length);
  }
// Making an array to produce random contents
 String randomcontent() {
    final String[] content = {"Cadbury Egg", "Reeses Egg", "Pink Starburst", "Yellow Peep", "25 Cents", "50 Cents", "One Dollar"};
    return content;
    Random random = new Random();
    int index = random.nextInt(content.length);
}