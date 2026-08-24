class MyHashSet {
    ArrayList<Boolean> ans;
    public MyHashSet() {
        ans = new ArrayList<>();
        for (int i = 0; i <= 1000000; i++) {
            ans.add(false);
        }
    }
    
    public void add(int key) {
        ans.set(key , true);
    }
    
    public void remove(int key) {
        ans.set(key,false);
    }
    
    public boolean contains(int key) {
        return ans.get(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */