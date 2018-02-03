package saf.interfaces;

public interface IWarningMessages {
	public String CELL_IS_EMPTY = "Cell is empty";
	String OUTPUT_CELL_IS_EMPTY = "Output cell is empty";
	String OUTPUT_IS_NOT_DRIVEN_BY_ANY_CELL = "Output is not driven by any cell";
	String INPUT_CELL_IS_EMPTY = "Input cell is empty";
	String THIS_ACTION_WOULD_OVERWRITE_SOME_CELLS_OPERATION_CANCELLED = 
			"This action would overwrite some cells: empty cells and retry.";
	
	String THE_FORMULA_IS_NOT_COMPLETE_YET = "The formula is not complete yet." ;
	String DIFFERENCE_IN_WARNING_MESSAGE_FOUND  = "Difference in warning message found" ;
}
