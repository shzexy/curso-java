class SubtitleDownloader{
  public static void main(String[] args) {
    double area = 50;
    int type;
    System.out.println("Area\tMateria\tValor");

    while (area <= 200) {
      type = ALVENARIA;
      while (type <= PLASTICO) {
        System.out.println(area + "\t" + type + "\t\t" + poolValue(area, type));
        type = type + 1;
      }
      area = area + 50;
    }
  }
}