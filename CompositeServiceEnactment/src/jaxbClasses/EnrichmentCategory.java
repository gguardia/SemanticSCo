/*******************************************************************************
 * Copyright 2016 Gabriela D. A. Guardia
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 *    http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*******************************************************************************/

package jaxbclasses;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "EnrichmentCategory")  
@XmlAccessorType(XmlAccessType.NONE)
public class EnrichmentCategory {  
      
    @XmlElement  
    private String EnrichmentCategoryName;   
    
    @XmlElement  
    private String EnrichmentCategoryDescription; 
      
    public String getName() {  
        return EnrichmentCategoryName;  
    }  
    
    public String getDescription() {  
        return EnrichmentCategoryDescription;  
    }  
      
    public void setName(String EnrichmentCategoryName) {  
        this.EnrichmentCategoryName = EnrichmentCategoryName;  
    }   
    
    public void setDescription(String EnrichmentCategoryDescription) {  
        this.EnrichmentCategoryDescription = EnrichmentCategoryDescription;  
    }   
}