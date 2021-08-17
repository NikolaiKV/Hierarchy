class Main {
    public static void main(String[] args) {
        Book book = new Book("«Ежик в тумане»", Status.AVAILABLE);

        System.out.println(book.toString());

        System.out.println();

        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        BookMover fromArchivedStatusMover = new FromArchivedStatusMover();
        BookMover fromBorrowedStatusMover = new FromBorrowedStatusMover();
        BookMover fromOverduedStatusMover = new FromOverduedStatusMover();

        fromAvailableStatusMover.moveToStatus(book, Status.BORROWED);
        System.out.println(book.toString());
    }
}