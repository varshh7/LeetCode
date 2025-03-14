class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        // Step 1: Compute the area of both rectangles
        int areaA = (ax2 - ax1) * (ay2 - ay1);
        int areaB = (bx2 - bx1) * (by2 - by1);

        // Step 2: Find the overlapping region
        int left = Math.max(ax1, bx1);    // Rightmost of left boundaries
        int right = Math.min(ax2, bx2);   // Leftmost of right boundaries
        int bottom = Math.max(ay1, by1);  // Uppermost of bottom boundaries
        int top = Math.min(ay2, by2);     // Lowermost of top boundaries

        // Step 3: Calculate overlap area (if it exists)
        int overlap = 0;
        if (right > left && top > bottom) {  // Ensure there is an overlap
            overlap = (right - left) * (top - bottom);
        }

        // Step 4: Return total area
        return areaA + areaB - overlap;
    }
}
