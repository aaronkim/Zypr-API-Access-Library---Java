/**
 * 
 * Initial version of this code (c) 2009-2011 Media Tuners LLC with a full license to Pioneer Corporation.
 * 
 * Pioneer Corporation licenses this file to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 * 
 */


package net.zypr.api.vo;

import org.json.simple.JSONObject;

public class VoiceCommandResponseVO
  extends GenericVO
{
  private VoiceCommandVariableVO[] _voiceCommandVariableVOs;
  private VoiceCommandVO[] _voiceCommandVOs;

  public VoiceCommandResponseVO(VoiceCommandVariableVO[] voiceCommandVariableVOs, VoiceCommandVO[] voiceCommandVOs)
  {
    super();
    _voiceCommandVariableVOs = voiceCommandVariableVOs;
    _voiceCommandVOs = voiceCommandVOs;
  }

  public VoiceCommandVariableVO[] getVoiceCommandVariableVOs()
  {
    return (_voiceCommandVariableVOs);
  }

  public VoiceCommandVariableVO getVariable(String name)
  {
    String nameNoUnderscore = name.replaceAll("_", "");
    for (int index = 0; index < _voiceCommandVariableVOs.length; index++)
      if (_voiceCommandVariableVOs[index].getName().equalsIgnoreCase(name) || _voiceCommandVariableVOs[index].getName().equalsIgnoreCase(nameNoUnderscore))
        return (_voiceCommandVariableVOs[index]);
    return (null);
  }

  public VoiceCommandVO[] getVoiceCommandVOs()
  {
    return (_voiceCommandVOs);
  }

  public JSONObject toJSON()
  {
    return (new JSONObject());
  }
}
