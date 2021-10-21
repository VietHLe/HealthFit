import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MacroModelComponent } from './macro-model.component';

describe('MacroModelComponent', () => {
  let component: MacroModelComponent;
  let fixture: ComponentFixture<MacroModelComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MacroModelComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MacroModelComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
