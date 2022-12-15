package IteratorPattern;

public class Tasks implements Container {

    String[] tasks = {"Учить Java", "Потом еще учить Java", "Ииииии опять учить Java"};

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }

    private class TaskIterator implements Iterator{

        int index = 0;
        @Override
        public boolean hasNext() {
            return index < tasks.length;
        }

        @Override
        public Object next() {
            return tasks[index++];
        }
    }
}
