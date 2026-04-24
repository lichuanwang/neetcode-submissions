class DynamicArray {

    private int size;
    private int[] array;


    public DynamicArray(int capacity) {
        this.size = 0;
        this.array = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            this.array[i] = -1;
        }
    }

    public int get(int i) {
        return this.array[i];
    }

    public void set(int i, int n) {
        this.array[i] = n;
    }

    public void pushback(int n) {
        
        if (this.array.length == size) {
            resize();
        }

        this.array[size] = n;
        size++;

    }

    public int popback() {
        if (size > 0) {
            this.size--;
        }
        return this.array[size];
    }

    private void resize() {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < this.array.length; i++) {
            newArray[i] = this.array[i];
        }
        this.array = newArray;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.array.length;
    }
}
