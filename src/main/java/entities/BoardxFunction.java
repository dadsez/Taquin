package entities;

@Entity
public class BoardxFunction {
	@Id
	@GeneratedValue
	private Long id; 
	private Board board;
	private Function function;
	public BoardxFunction() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
	public Function getFunction() {
		return function;
	}
	public void setFunction(Function function) {
		this.function = function;
	} 

		

}
