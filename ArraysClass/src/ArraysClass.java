
public class ArraysClass {

	public static void main(String[] args) {
		myList colors = new myList();
		colors.add("Yellow");
		colors.add("Blue");
		colors.add("Red");
		
		int s = colors.size();
		String blue = colors.get(1);
		
	}
	
	public static class myList {
		String[] store = new String[10];
		int size = 0;
		
//		Adds a string to the list
//		@param s the string to add to the list

		public void add(String s) {
			size = size++;
			if (size == store.length) {
				String[] temp = new String[store.length+10];
				for(int i = 0; i<store.length; i++) {
					temp[i] = store[i];
				}
				store = temp;
			}
			store[size] = s;
			
		}
		
//		Returns the current size of the list
//		@returns the current size of the list
		public int size() {
		return size;	
		}
		
//		Returns the string at the position passed in
//		@param i the position passed in
//		@return the string at the position passed in 
		
		public String get(int i) {
			if(i<0 || i > size-1) {
				return null;
			}
			return store[i];
		}
		
//		Removes the element from the list at the given position
//		@param i the position to remove from the list

		public void remove(int i) {	
			
			if(i < 0 || i >= size) {
				return;
			}
		
			store[i] = null;
			for(int j = i; j < size-1; j++) {
				store[j] = store[j+1];
			}
			store[size-1] = null; 
			size = size--;
		}
		
//		remove the string from the list
//		@param s the string to remove
		public void remove(String s) {
			
		}
	}

}
