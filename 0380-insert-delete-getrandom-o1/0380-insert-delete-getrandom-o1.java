class RandomizedSet {

    HashSet<Integer> hs;
    public RandomizedSet() {
        hs = new HashSet<Integer>();
    }
    
    public boolean insert(int val) {
        return hs.add(val);
    }
    
    public boolean remove(int val) {
        return hs.remove(val);
    }
    
    public int getRandom() {
        Integer[] arrayNumbers = hs.toArray(new Integer[hs.size()]);
        Random rndm = new Random();
        int rndmNumber = rndm.nextInt(hs.size());
        return arrayNumbers[rndmNumber];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */