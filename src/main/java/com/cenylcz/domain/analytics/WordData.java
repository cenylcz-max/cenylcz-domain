package com.cenylcz.domain.analytics;

import com.cenylcz.Model;
import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "words_data", schema = "analytics")
public class WordData extends Model {

    @Id
    @Column(name = "word", unique = true, nullable = false)
    private String word;

    @Column(name = "frequency", nullable = false)
    private Integer frequency;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordData wordData = (WordData) o;
        return Objects.equals(word, wordData.word) && Objects.equals(frequency, wordData.frequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, frequency);
    }

    @Override
    public String toString() {
        return "WordData{" +
                "word='" + word + '\'' +
                ", frequency=" + frequency +
                '}';
    }
}
