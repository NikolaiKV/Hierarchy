class FromOverduedStatusMover extends BookMover {

    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus() == Status.OVERDUED) {
            if (requestedStatus == Status.AVAILABLE || requestedStatus == Status.ARCHIVED) {
                book.setStatus(requestedStatus);
                System.out.println(String.format("Перевод книги из статуса OVERDUED в статус %s возможен", requestedStatus));
            } else if (book.getStatus() == Status.OVERDUED) {
                System.out.println(String.format("Перевод книги из статуса OVERDUED в статус %s невозможен", requestedStatus));
            }
        }
    }
}