class Spreadsheet {
  public Spreadsheet(int rows) {}

  public void setCell(String cell, int value) {
    spreadsheet.put(cell, value);
  }

  public void resetCell(String cell) {
    spreadsheet.put(cell, 0);
  }

  public int getValue(String formula) {
    final int i = formula.indexOf('+');
    return getToken(formula.substring(1, i)) + getToken(formula.substring(i + 1));
  }

  private Map<String, Integer> spreadsheet = new HashMap<>();

  private int getToken(final String token) {
    return Character.isDigit(token.charAt(0)) ? Integer.parseInt(token)
                                              : spreadsheet.getOrDefault(token, 0);
  }

}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */