class FromArchivedStatusMover extends BookMover {

    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus() == Status.ARCHIVED) {
            if (requestedStatus == Status.AVAILABLE) {
                book.setStatus(requestedStatus);
                System.out.println(String.format("Перевод книги из статуса ARCHIVED в статус %s возможен", requestedStatus));
            } else if(book.getStatus() == Status.ARCHIVED){
                System.out. println(String.format("Перевод книги из статуса ARCHIVED в статус %s невозможен", requestedStatus));
            }
        }
    }
}