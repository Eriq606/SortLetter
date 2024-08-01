public class ManyLettersException extends Exception{
    private Word word;

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }

    public ManyLettersException(Word word) {
        this.word = word;
    }

    @Override
    public String getMessage() {
        String message="This word contains many letters: "+getWord().getWord();
        return message;
    }
    
}
