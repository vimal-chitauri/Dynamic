package Graph2025;

import java.util.*;

public class WordLadder_1 {
    class Pair{
        String word;
        int sequence;

        Pair(String word, int sequence){
            this.word=word;
            this.sequence=sequence;
        }
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set=new HashSet<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(beginWord,1));
        int len=wordList.size();

        for(int i=0; i<len;i++){
            set.add(wordList.get(i));
        }

        set.remove(beginWord);

        while(!queue.isEmpty()){
            String word=queue.peek().word;
            int sequence=queue.peek().sequence;

            queue.remove();
            if(word.equals(endWord)){
                return sequence;
            }
            for(int i=0; i<word.length();i++){
                for(char ch='a'; ch<='z';ch++){
                    char replacedCharArray[]= word.toCharArray();
                    replacedCharArray[i]=ch;
                    String replaceWord=new String(replacedCharArray);
                    if(set.contains(replaceWord)){
                        set.remove(replaceWord);
                        queue.add(new Pair(replaceWord,sequence+1));
                    }

                }
            }

        }
        return 0;
    }
}
