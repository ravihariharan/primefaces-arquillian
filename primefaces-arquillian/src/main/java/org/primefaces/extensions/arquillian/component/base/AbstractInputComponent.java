/**
 * Copyright 2011-2018 PrimeFaces Extensions
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.extensions.arquillian.component.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class AbstractInputComponent extends AbstractComponent {

    protected WebElement getInput() {
        return root;
    }

    @Override
    public boolean isEnabled() {
        return getInput().isEnabled();
    }

    public WebElement getAssignedLabel() {
        return driver.findElement(By.cssSelector("label[for='" + getInput().getAttribute("id") + "']"));
    }

    public String getAssignedLabelText() {
        return getAssignedLabel().getText();
    }

}
