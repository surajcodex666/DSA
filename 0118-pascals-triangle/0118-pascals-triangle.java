class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Loop for each row
        for (int i = 0; i < numRows; i++) {
            // Create a row with size (i+1)
            List<Integer> row = new ArrayList<>(Collections.nCopies(i + 1, 1)); // create i+1 copies of i so if i = [1] this will create i =[1,1]

            // Fill elements from index 1 to i-1 (middle values)
            for (int j = 1; j < i; j++) {
                // Each element = sum of two elements above it
                row.set(j, triangle.get(i - 1).get(j - 1) +
                           triangle.get(i - 1).get(j));  // j<i so if j = 2 then i = 3
            }

            // Add current row to the triangle
            triangle.add(row);
        }
        return triangle;
    }
}