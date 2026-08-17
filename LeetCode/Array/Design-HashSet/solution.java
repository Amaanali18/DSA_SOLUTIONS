class MyHashSet {

    LinkedList<Integer> set;

    public MyHashSet() {
        set = new LinkedList<>();
    }
    
    public void add(int key) {
        if(!contains(key)) set.add(key);
    }
    
    public void remove(int key) {
        if(contains(key)){
            int i=0;
            for(;i<set.size();i++){
                if(set.get(i)==key){
                    break;
                }
            }
            set.remove(i);
        }
    }
    
    public boolean contains(int key) {
        return set.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */