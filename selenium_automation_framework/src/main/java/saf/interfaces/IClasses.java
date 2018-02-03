package saf.interfaces;

public interface IClasses {

	// Cell formating
	String CELL_IS_EMPTY = "visyond-emptycell-within-row-col-range" ;
	String CELL_HAS_A_NUMBER = "visyond-cell-has-number" ;
	String CELL_HAS_A_STRING = "visyond-cell-has-string" ;
	String CELL_HAS_A_FORMULA = "visyond-cell-has-formula" ;
	String CELL_HAS_A_FORMULA_PROJECTED = "visyond-cell-has-formula-projected" ;
	String CELL_HAS_AN_ERROR = "visyond-cell-has-error" ;
	String CELL_IS_AN_EMPTY_CELL = "visyond-emptycell-within-row-col-range";
	String CELL_IS_SELECTED = "selected" ;
	String CELL_IS_ACTIVE = "active" ;
	String CELL_HAS_NIL = "visyond-cell-has-nil" ;
	String CELL_IS_DANGLING = "This cell is 'dangling': it is an empty node which has no value nor a formula nor any dependents or precedents.";
	String CELL_HAS_CASES = "vBulletCase" ;
	String CELL_NOT_EDITABLE = "visyond-cell-not-editable" ;
	String CELL_PART_2 = "visyond-cell-part2" ;
	
	// Cell actions
	/*String CELL_ARROW_PROJECT_RIGHT = "inCellArrowProjectRight" ;
	String CELL_ARROW_PROJECT_LEFT = "inCellArrowProjectLeft" ;
	String CELL_ARROW_PROJECT_UP = "inCellArrowProjectUp" ;
	String CELL_ARROW_PROJECT_DOWN = "inCellArrowProjectDown" ;

	String CELL_MANAGE_CASES = "inCellCases" ;
	String CELL_INFORMATION = "inCellInfo" ;
	String CELL_SHOW_DEPENDENT_CELL = "inCellDependencies" ;
	String CELL_GOAL_SEEK_BTN = "inCellGoalBtn" ;
	String CELL_SHOW_PRECEDENT_CELLS = "inCellPrecedents" ;*/
	
	// Column actions
	/*String HEADER_CELL_ARROW_PROJECT_LEFT = "headerCellArrowProjectLeft" ;
	String HEADER_CELL_ARROW_PROJECT_RIGHT = "headerCellArrowProjectRight" ;
	String HEADER_CELL_PROJECT_NAME_LEFT = "projNameLeft" ;
	String HEADER_CELL_PROJECT_NAME_RIGHT = "projNameRight" ;
	String HEADER_CELL_DELETE_COLUMN_HEADER = "delButtonForList";
	String HEADER_CELL_INSERT_COLUMN_RIGHT = "insertColRight" ;
	String HEADER_CELL_DELETE_SHIFT_COLUMN_LEFT = "delShiftColLeft" ;
	String HEADER_CELL_SELECT_COLUMN_BUTTON = "selColButton" ;
	String HEADER_CELL_DELETE_SHIFT_COLUMN_RIGHT = "delShiftColRight" ;
	String HEADER_CELL_INSERT_COLUMN_LEFT = "insertColLeft" ;*/
	
	
	// Range Decorators
	String SLICK_RANGE_DECORATOR  = "slick-range-decorator";
	
	String TOGGLED = "toggled" ;
	String FAST_SHOW = "fast-show" ;
	String FAST_HIDE = "fast-hide" ;
	
	String CHART_PANE_HEADER = "chartPaneHeader";
	String CLOSE_OPT_PANE = "closeOptPane";
	String NODE_TYPE_INFO_DETAILS = "nodeTypeInfoDetails";
	
}

