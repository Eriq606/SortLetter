public class Word implements Comparable<Word>{
    private String word;
    
    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public char letter() throws NoLetterInWordException, ManyLettersException{
        char character=' ';
        int letterCount=0;
        for(char c:getWord().toCharArray()){
            if(Character.isLetter(c)){
                character=Character.toLowerCase(c);
                letterCount++;
            }
        }
        if(letterCount==0){
            throw new NoLetterInWordException(this);
        }else if(letterCount>1){
            throw new ManyLettersException(this);
        }
        return character;
    }

    @Override
    public int compareTo(Word o) {
        int result=1;
        try {
            char letter1=letter();
            char letter2=o.letter();
            if(letter1<letter2){
                result=-1;
            }else if(letter1==letter2){
                result=0;
            }
        } catch (NoLetterInWordException | ManyLettersException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
    
}
