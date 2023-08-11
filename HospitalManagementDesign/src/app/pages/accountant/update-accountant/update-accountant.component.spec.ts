import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateAccountantComponent } from './update-accountant.component';

describe('UpdateAccountantComponent', () => {
  let component: UpdateAccountantComponent;
  let fixture: ComponentFixture<UpdateAccountantComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [UpdateAccountantComponent]
    });
    fixture = TestBed.createComponent(UpdateAccountantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
