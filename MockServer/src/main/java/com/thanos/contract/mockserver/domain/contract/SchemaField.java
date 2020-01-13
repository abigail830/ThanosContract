package com.thanos.contract.mockserver.domain.contract;

import com.thanos.contract.mockserver.domain.contract.validate.Validator;
import com.thanos.contract.mockserver.domain.contract.validate.ValidatorFactory;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SchemaField {
    String name;
    String type;
    Integer length;
    String content;
    Validator validator;

    public SchemaField(String name, String type, Integer length, String content) {
        this.name = name;
        this.type = type;
        this.length = length;
        this.content = content;
        this.validator = ValidatorFactory.getValidator(content);
    }

    public boolean match(String extractedContent) {
        return validator.validate(extractedContent);
    }

    @Override
    public String toString() {
        return "SchemaField{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", length=" + length +
                ", content='" + content + '\'' +
                '}';
    }

}
