package edu.javacourse.robot.datastructures;

public class ObjectQueue
{
    // ��������� �� ������ �������
    private ObjectBox head = null;
    // ��������� �� ��������� �������
    private ObjectBox tail = null;
    // ���� ��� �������� ������� �������
    private int size = 0;

    public void push(Object obj) {
        // ����� ������� ��������������� ������ � �������� ����� ������� � ����
        ObjectBox ob = new ObjectBox();
        ob.setObject(obj);
        // ���� ������� ������ - � ��� ��� ��� ���������
        if (head == null) {
            // ������ ���� ������ ��������� �� ��� ������ �������
            head = ob;
        } else {
            // ���� ��� �� ������ �������, �� ����, ����� ��������� ������� � �������
            // �������� �� ����� ��������� �������
            tail.setNext(ob);
        }
        // � � ����� ������ ��� ���� ��� "�����" ����������� �� ����� �������
        // ���� ��� ������ �������, �� "������" � "�����" ����� ��������� �� ���� � ��� �� �������
        tail = ob;
        // ����������� ������ ����� �������
        size++;
    }

    public Object pull() {
        // ���� � ��� ��� ���������, �� ���������� null
        if (size == 0) {
            return null;
        }
        // �������� ��� ������ �� ���������������� ������ �� "������"
        Object obj = head.getObject();
        // ���������� "������" �� ��������� �������
        head = head.getNext();
        // ���� ��� ��� ������������ �������, �� head ������ ����� null
        // � ����� tail (�����) ���� ����� ������� �� null.
        if (head == null) {
            tail = null;
        }
        // ��������� ������ �������
        size--;
        // ���������� ��������
        return obj;
    }

    public int size() {
        return size;
    }

    // ��� ��������������� ����� ����� ������ �� ����������� ����
    private class ObjectBox
    {
        // ���� ��� �������� �������
        private Object object;
        // ���� ��� �������� �� ��������� ������� � �������.
        // ���� ��� ����� NULL - ������ ��� ��������� �������
        private ObjectBox next;

        public Object getObject() {
            return object;
        }

        public void setObject(Object object) {
            this.object = object;
        }

        public ObjectBox getNext() {
            return next;
        }

        public void setNext(ObjectBox next) {
            this.next = next;
        }
    }
}