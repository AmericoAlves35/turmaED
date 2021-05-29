public class ListaDupla {
    private No first, last;
    private int size;

    public ListaDupla() {
        first = last = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public No getfirst() {
        return first;
    }

    public void insertFirt(int value) {
        No newNo = new No(value);

        if (isEmpty()) {
            first = last = newNo;
        } else {
            newNo.setNextNo(first);
            first.setPrevNo(newNo);
            first = newNo;
        }
        size++;
    }

    public void insertLast(int value) {
        No newNo = new No(value);

        if (isEmpty()) {
            first = last = newNo;
        } else {
            newNo.setPrevNo(last);
            last.setNextNo(newNo);
            last = newNo;
        }
        size++;
    }

    public No deleteFirst() {
        No aux = first;

        if (isEmpty()) {
            return null;
        }

        if (first == last) {
            first = last = null;
        } else {
            first = first.getNextNo();
            first.setPrevNo(null);
        }
        size--;
        return aux.copia();
    }

    public No deleteLast() {
        No aux = last;

        if (isEmpty()) {
            return null;
        }
        if (first == last) {
            first = last = null;
        } else {
            last = last.getPrevNo();
            last.setNextNo(null);
        }
        size--;
        return aux.copia();
    }

    public No delete(int value) {
        No aux = first;

        while (aux != null) {
            if (aux.getValue() == value) { // achou?
                if (aux == first) { // achou na primeira posição
                    return deleteFirst();
                }
                if (aux == last) {
                    return deleteLast();
                }
                // remove do "meio"
                aux.getPrevNo().setNextNo(aux.getNextNo());
                aux.getNextNo().setPrevNo(aux.getPrevNo());
                size--;
                return aux.copia();
            }
            aux = aux.getNextNo();
        }
        return null;
    }

    public String displayForward() {
        String out = "";
        No aux = first;

        while (aux != null) {
            out += aux.getValue() + " ";
            aux = aux.getNextNo();
        }
        return out;
    }

    public String displayBackward() {
        String out = "";
        No aux = last;

        while (aux != null) {
            out += aux.getValue() + " ";
            aux = aux.getPrevNo();
        }
        return out;
    }

}
