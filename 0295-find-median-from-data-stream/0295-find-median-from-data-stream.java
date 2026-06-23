class MedianFinder {
    PriorityQueue<Integer>minHeap=new PriorityQueue<>();
    PriorityQueue<Integer>maxHeap=new PriorityQueue<>(Collections.reverseOrder());
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(maxHeap.isEmpty()) maxHeap.offer(num);
        else{
            if(num<maxHeap.peek()) maxHeap.offer(num);
            else minHeap.offer(num);
        }
        if(maxHeap.size()==minHeap.size()+2){
            minHeap.offer(maxHeap.poll());
        }else if(minHeap.size()==maxHeap.size()+2){
            maxHeap.offer(minHeap.poll());
        }
        
    }
    
    public double findMedian() {
        if(maxHeap.size()==minHeap.size()+1){
            return maxHeap.peek();
        }else if(minHeap.size()==maxHeap.size()+1){
            return minHeap.peek();
        }else{
            return (maxHeap.peek()+minHeap.peek())/2.0;
        } 
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */