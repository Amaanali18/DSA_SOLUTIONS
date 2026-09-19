class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int closestX = Math.max(x1, Math.min(x2, xCenter));
        int closestY = Math.max(y1, Math.min(y2, yCenter));
        return distance(closestX, closestY, xCenter, yCenter) <= radius;
    }
    public double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }
}