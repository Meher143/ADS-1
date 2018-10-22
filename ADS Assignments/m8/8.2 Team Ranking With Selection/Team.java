class Team {
    private CricketTeam[] teams;
    private int size;
    Team() {
        teams = new CricketTeam[10];
        size = 0;
    } 
    /**
     * Adds a cricket team, the time complexcity is O(1)
     *since we increment once and assign team to array.
     *
     * @param      t     { parameter_description }
     */
    
    public void addCricketTeam(CricketTeam t) {
        teams[size++] = t;
    }
    /**
     * Returns a string representation of the object.
     * The time complexcity is O(N).
     * @return     String representation of the object.
     */
    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++) {
            s += teams[i].name+",";
        }
        return s.substring(0, s.length() - 1);
    }
    /**
     * { function_description }.
     *  The time complexcity is O(1)
     *since we increment once and assign team to array.
     *
     * @param      teams  The teams
     * @param      i      { parameter_description }
     * @param      j      { parameter_description }
     */
    public void exch(CricketTeam[] teams, int i, int j) {
        //System.out.println(";;;;;;");
        CricketTeam ct = teams[j];
        teams[j] = teams[i];
        teams[i] = ct;
    }
    /**
     * The time complexcity is O(N^2), since we run the Selection sort
     * algorithm on the array of items.
     */
    public void selectionSort() {
        //System.out.println("-------");
        for (int i = 0; i < size - 1; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                //System.out.println("[[[[[[");
                if (less(teams, j, min)) {
                    min = j;
                } 
            }
            exch(teams, i, min);
            //System.out.println(teams[i]);
        }
    }
    /**
     * { function_description }.
     *
     * @param      arr   The arr
     * @param      i     { parameter_description }
     * @param      j     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public boolean less(CricketTeam[] arr, int i, int j) {
        //System.out.println("0000000");
        return  arr[i].compareTo(arr[j]) > 0;
    }
}
