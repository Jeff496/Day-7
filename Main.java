class Main {
  public static void main(String[] args) {
    // Data structures
    // Arrays 
    // data - information that we have/ want
    // data structure - a way in which we store data
    // ex of data
    int poolPeople = 12;
    int veggies = 13;
    // To make an array 
    int[] testAverages = new int[5];
    // {0, 0, 0, 0, 0}
    testAverages[0] = 98;
    // {98, 0, 0, 0, 0}
    testAverages[3] = 89;
    // {98, 0, 0, 89, 0}
    testAverages[1] = 95;
    testAverages[2] = 92;
    testAverages[4] = 94;
    // {98, 89, 95, 92, 94}
    System.out.println(testAverages);
    // need to use a for loop to traverse arrays
    for (int i = 0; i < testAverages.length; i++){
      System.out.print(testAverages[i] + " ");
    }
    // length is not a method so we don't need the ()
    // + " " is for spacing the print statements
    // the loop is traversing the array or accessing all the contents
    System.out.println("");
    System.out.println(testAverages[0]);
    double[] battingAverage = {.45, .333, .127, .5};
    for (int i = 0; i < battingAverage.length; i++){
      System.out.print(battingAverage[i] + " ");
    }
    System.out.println("");
    // Find the average of the batters' average
    double averages = 0;
    for (int i = 0; i < battingAverage.length; i++){
      averages = averages + battingAverage[i];
    }
    averages = averages/battingAverage.length;
    System.out.println(averages);
    //print highest number and index it is on
    int[] numbers = {23, 11, 9, -3, 50, 7};
    int bigNum = Integer.MIN_VALUE;
    int index = -1;
    for (int i = 0; i < numbers.length; i++){
      if (bigNum < numbers[i]){
        bigNum = numbers[i];
        index = i;
      }
    }
    System.out.println("Biggest number is " + bigNum + " and the index is " + index);

    // String arrays
    String[] shoppingList = new String[3];
    // or 
    String[] myList = {"snap", "crackle", "pop"};
    shoppingList[0] = "snap";
    shoppingList[1] = "crackle";
    shoppingList[2] = "pop";
    // determine if the elements in the array are all the same
    // use equals()
    boolean same = true;
    for (int i = 0; i < myList.length; i++){
      if (!(myList[i].equals(shoppingList[i]))){
        same = false;
      }
    }
    System.out.println(same);
  }
}