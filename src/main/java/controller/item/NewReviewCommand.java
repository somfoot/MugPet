package controller.item;

public class NewReviewCommand {
	private int r_id;
	private String review;
	private int item_id;
	private int u_id;
	
	public NewReviewCommand() {}
	
	public NewReviewCommand(int r_id, String review, int item_id, int u_id) {
		this.r_id = r_id;
		this.review = review;
		this.item_id = item_id;
		this.u_id = u_id;
	}

	public int getR_id() { return r_id; }
	public void setR_id(int r_id) { this.r_id = r_id; }

	public String getReview() { return review; }
	public void setReview(String review) { this.review = review; }

	public int getItem_id() { return item_id; }
	public void setItem_id(int item_id) { this.item_id = item_id; }

	public int getU_id() { return u_id; }
	public void setU_id(int u_id) { this.u_id = u_id; }
	
	
}
