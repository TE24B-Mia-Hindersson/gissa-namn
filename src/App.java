void main() {
    String[] rotfrukter = {"morot", "radish", "potatis", "rödbeta"};
    int points = 0;
IO.println("Gissa 3 rotfrukter och få poäng");
for (int i= 1; i<= 3; i ++)
{
String gissning =IO.readln();
for (int j = 0; j< rotfrukter.length; j++)
{
   if (gissning.equals(rotfrukter[j]))
{
    IO.println("Rätt 1+ poäng");
    points ++;
}
}
}
IO.println("Du fick" + points + "poäng");
}
