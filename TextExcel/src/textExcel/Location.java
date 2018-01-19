package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
	private int row;
	private int col;
	private String cellName;
	
	 public SpreadsheetLocation(int rowp, int colp) {
	        row = rowp;
	        col = colp;
	    }
	
    @Override
    public int getRow()
    {
        return row;
    }

    @Override
    public int getCol()
    {
        return col;
    }
   
    
    public SpreadsheetLocation(String cellName)
    {
    	this.cellName = cellName;
    	col = (int) cellName.toUpperCase().charAt(0) - (int) 'A';
    	row = Integer.parseInt(cellName.substring(1)) - 1;
    }

}
