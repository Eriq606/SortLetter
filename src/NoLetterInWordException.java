public class NoLetterInWordException extends Exception{
    private Word word;
    
    public NoLetterInWordException(Word word) {
        this.word = word;
    }

    @Override
    public String getMessage() {
        String message="This word has no letter: "+getWord().getWord();
        return message;        
    }

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }
    
}
