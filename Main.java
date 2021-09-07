class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
    int totalMm;
    double blue;
    double brown;
    double green;
    double orange;
    double red;
    double yellow;
    double sumOfMm;
    totalMm = 55*11;
    blue = .24 * totalMm;
    brown = .13 * totalMm;
    green = .16 * totalMm;
    orange = .2 * totalMm;
    red = .13 * totalMm;
    yellow = .14 * totalMm;
    System.out.println("blue: " + blue);
    System.out.println("brown: " + brown);
    System.out.println("green: " + green);
    System.out.println("orange: " + orange);
    System.out.println("red: " + red);
    System.out.println("yellow: " + yellow);
    sumOfMm = blue + brown + green + orange + red + yellow;
    System.out.println("sumOfMm: " + sumOfMm);
    if (blue < brown && red > orange)
    {
      System.out.println("Blue under Brown and Red over Orange");
    }
  if(brown >= green)
  {
    System.out.println("Brown is greater than or equal to Green");
  }
  if(totalMm == sumOfMm)
  {
    System.out.println("Numbers match");
  }

  }
}